//package com.yeyu.controller;
//
//
//import java.io.File;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//
//@Controller
//public class InsertItemController {
//
//	@Value("${web.upload-path}")
//    private String path;
//	
//	@Value("${img.paths}")
//	private String imgPath;
//	
//	@Value("${img.server.url}")
//	private String serverUrl;
//	
//	@RequestMapping("/pic/upload")
//	@ResponseBody
//	public String picUpload(MultipartFile uploadFile,HttpServletRequest request) {
//		/* 测试方法一 */
////		System.out.println("文件名："+uploadFile.getOriginalFilename());
////		System.out.println("扩展名："+uploadFile.getOriginalFilename().substring(uploadFile.getOriginalFilename().lastIndexOf(".")));
////		try {
////			System.out.println("二进制文件："+uploadFile.getBytes());
////			System.out.println("文件大小："+uploadFile.getSize());
////			String[] a = uploadFile.getOriginalFilename().split("\\.");
////			System.out.println("############+++::"+uploadFile.getOriginalFilename().split("\\."));
////			System.out.println("String0####:"+a[0]);
////			System.out.println("String1####:"+a[1]);
////			System.out.println(uploadFile.getContentType());
//////			InputFilter filter = (InputFilter) uploadFile.getInputStream();
//////			System.out.println("##########:::"+filter.getEncodingName());
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
////		filePath:F:\java_path\bootMybatis\src\main\webapp\*upload/
////		dirF:\java_path\bootMybatis\src\main\webapp\*upload
////		pathF:\java_path\bootMybatis\src\main\webapp\*upload/a.png
//
//		/* 测试方法二 */
//		if(!uploadFile.isEmpty()) {
//			System.out.println("配置文件图片地址："+imgPath);
//		System.out.println("配置文件访问地址："+serverUrl);
//            String filePath = request.getSession().getServletContext().getRealPath("/") + imgPath;
//            System.out.println("filePath:"+filePath);
//            File dir = new File(filePath);
//            if(! dir.exists()) {
//                dir.mkdir();
//            }
//            System.out.println("dir"+dir);
//            String path = filePath + uploadFile.getOriginalFilename();
//            System.out.println("path"+path);
//            File tempFile = null;
//            //save to the /upload path
//            try {
//                tempFile =  new File(path);
//                uploadFile.transferTo(tempFile);
//            }catch (Exception e) {
//            	e.printStackTrace();
//			}
//		}
//		
//		Map map = new HashMap<>();
//		map.put("error", 0);
//		map.put("url", "localhost:8080/a.png");
//		return JsonUtils.objectToJson(map);
//		
//
//}
//}
