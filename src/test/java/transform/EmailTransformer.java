package transform;

import cucumber.api.Transformer;

public class EmailTransformer extends Transformer<String> {

    @Override
    public String transform(String username) {
        return username.concat("@test.com");
    }
}
