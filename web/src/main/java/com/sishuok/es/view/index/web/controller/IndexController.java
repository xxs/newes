/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.sishuok.es.view.index.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sishuok.es.common.web.controller.BaseController;

/**
 * Controller - 首页
 * 
 * @author xxs
 * @version 1.0 Beta
 */
@Controller("viewIndexController")
@RequestMapping("/view/index")
public class IndexController extends BaseController{
	
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String tree(Model model) {
        return viewName("index");
    }
}