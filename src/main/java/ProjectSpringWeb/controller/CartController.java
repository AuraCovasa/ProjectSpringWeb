package ProjectSpringWeb.controller;

import ProjectSpringWeb.model.CartItem;
import ProjectSpringWeb.service.impl.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<Void> addToCart(@RequestBody CartItem request){
        cartService.addToCart(request.getUserId(), request.getProductId(), request.getQuantity());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<CartItem>> getCart(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.getCartItems(userId));
    }

    @DeleteMapping("/remove/{userId}/{productId}")
    public ResponseEntity<Void> removeFromCart(@PathVariable("userId") Long userId, @PathVariable("productId") Long productId) {
        cartService.removeFromCart(userId, productId);
        return ResponseEntity.ok().build();
    }
}

