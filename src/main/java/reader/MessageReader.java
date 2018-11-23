package reader;

import common.Message;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MessageReader {

    private final String path;

    public MessageReader(String path) {
        this.path = path;
    }


    public List<Message> read() {
        List<Message> messages = new ArrayList<Message>();
        try(Stream<String> stream = Files.lines(Paths.get(path),StandardCharsets.UTF_8)) {
            stream.forEach(s -> messages.add(DataParser.getMessageLine(s)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return messages;
    }

}
