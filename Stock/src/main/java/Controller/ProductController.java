package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ProductController<TopicService>{
	private ProductController productController;
	private TopicService topicService;

	@Inject
    public void TopicService(TopicService topicService) {
        this.topicService = topicService;
    }

	 @RequestMapping(value="/", method=RequestMethod.GET)
	    public String index(ProductController model) {
	        model.addAttribute("SKU", TopicService.getSKU());
	        model.addAttribute("productName", TopicService.getproductName());
	        model.addAttribute("storeName", TopicService.getstoreName());
	        model.addAttribute("Quantity", TopicService.getQuantity());
	        model.addAttribute("totalsale", TopicService.gettotalsale());
	        model.ddAttribute(" weeklyQuantity", TopicService.getweeklyQuantity());
	        model.addAttribute("message", TopicService.getMessage());     
	        return "index";
	    }
	 @RequestMapping(value="/addProduct/{Quantiy}", method=RequestMethod.GET)
	    public String addProduct(@PathVariable String Quantiy) {
		 ((ProductController) topicService).addProduct(Quantiy);
	        return "redirect:/";
	    }
	    
	    @RequestMapping(value="/getQuantity", method=RequestMethod.GET)
	    public String getQuantity() {
	    	((ProductController) topicService).getQuantity();
	        return "redirect:/";
	    }
	    
	    @RequestMapping(value="/totalsale", method=RequestMethod.GET)
	    public String totalsale() {
	    	((ProductController) topicService).totalsale();
	        return "redirect:/";
	    }
	    
	    @RequestMapping(value="/weeklyQuantity/{id}", method=RequestMethod.GET)
	    public String weeklyQuantity(@PathVariable("id") int id) {
	    	topicService.weeklyQuantity(id);
	        return "redirect:/";
	    }
	}
