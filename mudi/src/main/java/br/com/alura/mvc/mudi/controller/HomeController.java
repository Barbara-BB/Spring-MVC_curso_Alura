package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("xiamomi");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/41s708mKqJL._AC_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Redmi-64GB-Dual/dp/B08B3QSVM6/ref=asc_df_B08B3QSVM6/?tag=googleshopp00-20&linkCode=df0&hvadid=379773236150&hvpos=&hvnetw=g&hvrand=14329138195742527781&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001773&hvtargid=pla-976739522567&psc=1");
		pedido.setDescricao("decrição");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos",pedidos);
		return "home";
	}

}
