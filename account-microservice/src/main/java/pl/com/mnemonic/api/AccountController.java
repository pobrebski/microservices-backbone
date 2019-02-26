package pl.com.mnemonic.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.com.mnemonic.pojo.Account;

@RestController
public class AccountController {
    private static final Logger log = LoggerFactory.getLogger(AccountController.class);

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ResponseEntity<Account> createNewAccount() {
        return new ResponseEntity<Account>(new Account("test", "test"), HttpStatus.CREATED);
    }
}
