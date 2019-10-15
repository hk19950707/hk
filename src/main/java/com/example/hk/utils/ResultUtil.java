package com.example.hk.utils;


import com.example.hk.enums.PfResultEnum;

public class ResultUtil {

	/**
	 * 默认返回成功
	 * 
	 * @return JSONResponse
	 */
	public static JSONResponse success() {
		return success(new String());
	}

	/**
	 * 返回成功及数据
	 * 
	 * @param
	 * @return JSONResponse
	 */
	public static <T>JSONResponse<T> success(T object) {
		return success(PfResultEnum.SUCCESS, object);
	}

	/**
	 * 返回成功信息
	 * 
	 * @param resSuccess
	 * @return JSONResponse
	 */
	public static JSONResponse success(PfResultEnum resSuccess) {
		return success(resSuccess, null);
	}

	/**
	 * 返回成功信息及结果
	 * 
	 * @param resSuccess
	 * @param object
	 * @return JSONResponse
	 */
	public static <T>JSONResponse<T> success(PfResultEnum resSuccess, T object) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setSuccess(true);
		jsonResponse.setData(object);
		jsonResponse.setCode(resSuccess.code());
		jsonResponse.setMessage(resSuccess.message());
		return jsonResponse;
	}

	/**
	 * 返回信息
	 * 
	 * @param message
	 * @return JSONResponse
	 */
	public static JSONResponse success(String message) {
		return success(PfResultEnum.SUCCESS.code(), message, null);
	}

	/**
	 * 自定义编码和返回信息
	 * 
	 * @param code
	 * @param message
	 * @return JSONResponse
	 */
	public static JSONResponse success(Integer code, String message) {
		return success(code, message, null);
	}

	/**
	 * 自定义编码、返回信息和数据
	 * 
	 * @param code
	 * @param message
	 * @param object
	 * @return JSONResponse
	 */
	public static JSONResponse success(Integer code, String message, Object object) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setSuccess(true);
		jsonResponse.setData(object);
		jsonResponse.setCode(code);
		jsonResponse.setMessage(message);
		return jsonResponse;
	}

	/**
	 * 返回失败信息
	 * 
	 * @param resError
	 * @return JSONResponse
	 */
	public static JSONResponse error(PfResultEnum resError) {
		return error(resError, null);
	}

	/**
	 * 返回失败信息及结果
	 * 
	 * @param resError
	 * @param object
	 * @return JSONResponse
	 */
	public static JSONResponse error(PfResultEnum resError, Object object) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setSuccess(false);
		jsonResponse.setData(object);
		jsonResponse.setCode(resError.code());
		jsonResponse.setMessage(resError.message());
		return jsonResponse;
	}

	/**
	 * 自定义返回失败信息
	 * 
	 * @param message
	 * @return JSONResponse
	 */
	public static JSONResponse error(String message) {
		return error(PfResultEnum.FAILURE.code(), message, null);
	}

	/**
	 * 自定义返回失败编码信息
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
	public static JSONResponse error(String code, String message) {
		return error(message, null);
	}

	/**
	 * 自定义返回编码信息及数据
	 * 
	 * @param message
	 * @param object
	 * @return JSONResponse
	 */
	public static JSONResponse error(Integer code, String message, Object object) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setSuccess(false);
		jsonResponse.setData(object);
		jsonResponse.setCode(code);
		jsonResponse.setMessage(message);
		return jsonResponse;
	}
}
