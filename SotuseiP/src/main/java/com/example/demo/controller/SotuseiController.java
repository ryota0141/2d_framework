package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SotuseiController {
    //トップ画面
	@RequestMapping(path = "/top", method = RequestMethod.GET)
	public String input1() {
		return "top";
	}
	//ログイン画面
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String input2() {
		return "login";
    }
	//新規登録画面
	@RequestMapping(path = "/new", method = RequestMethod.GET)
	public String input3() {
		return "new";
    }
	//マイページ編集画面
	@RequestMapping(path = "/mypageedit", method = RequestMethod.GET)
	public String input4() {
		return "mypageedit";
    }
	//投稿フォーム画面
	@RequestMapping(path = "/post", method = RequestMethod.GET)
	public String input5() {
		return "post";
    }
	//マイページ画面
	@RequestMapping(path = "/mypage", method = RequestMethod.GET)
	public String input6() {
		return "mypage";
}
	@RequestMapping(path = "/postdetail", method = RequestMethod.GET)
	public String input7() {
		return "postdetail";
}
	@RequestMapping(path = "/genre", method = RequestMethod.GET)
	public String input8() {
		return "genre";
}
	@RequestMapping(path = "/anime", method = RequestMethod.GET)
	public String input9() {
		return "anime";
}
	@RequestMapping(path = "/game", method = RequestMethod.GET)
	public String input10() {
		return "game";
}
	@RequestMapping(path = "/comic", method = RequestMethod.GET)
	public String input11() {
		return "comic";
}
	@RequestMapping(path = "/food", method = RequestMethod.GET)
	public String input12() {
		return "food";
}
	@RequestMapping(path = "/sports", method = RequestMethod.GET)
	public String input13() {
		return "sports";
}
	@RequestMapping(path = "/hobby", method = RequestMethod.GET)
	public String input14() {
		return "hobby";
}
}