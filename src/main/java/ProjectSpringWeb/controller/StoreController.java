package ProjectSpringWeb.controller;

import ProjectSpringWeb.config.AppConfig;
import ProjectSpringWeb.model.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/stores")
@RequiredArgsConstructor

public class StoreController {
    private final AppConfig appConfig;
    private final Store store;

    @GetMapping("/byName")
    public Store getStoreByName(@RequestParam String name)
    {
        return store.toReturnStore();
    }
}
