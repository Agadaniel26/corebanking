package controller;

import config.Urls;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AccountController {
    @PostMapping(value = Urls.BASE_CONTEXT_URL)
    public DefaultApiResponse openAccount(@Valid @RequestBody OpenAccountDto openAccountDto) {
        log.info("[+] Inside AccountController.openAccount with payload {}", openAccountDto);
        return accountService.openAccount(openAccountDto);
    }


}
