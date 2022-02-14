package com.tangyinzi.cloudtestservice.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author huiwu.tang
 * @version v0.1.0
 * @describe
 */
//@FeignClient(value = "service-base", name = "service-base", url = "http://localhost:31091")
@FeignClient("service-base")
public interface BaseFeignClient {

    //@RequestMapping(value = "/dictDataConfig", method = RequestMethod.POST)
    //Long insert(DictDataConfigModel dictDataConfig);
//
    //@RequestMapping(value = "/dictDataConfig", method = RequestMethod.PUT)
    //Boolean update(DictDataConfigModel dictDataConfig);
//
    //@RequestMapping(value = "/dictDataConfig/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    //DictDataConfigModel selectById(@PathVariable("id") Long id);
//
    //@ApiOperation("*根据CODE查询第三方接口配置")
    //@RequestMapping(value = "/baseThirdApiConfig/selectByCode", method = RequestMethod.POST)
    //BaseThirdApiConfig selectByCode(@RequestBody String code);
//
    //@ApiOperation("查询所有标签")
    //@RequestMapping(value = "/sysLabel/selectList", method = RequestMethod.GET)
    //List<SysLabel> selectList();
//
    //@ApiOperation("根据KEY查询系统字典数据表")
    //@RequestMapping(value = "/dictDataConfig/selectListByKey", method = RequestMethod.GET)
    //List<DictDataConfigModel> selectListByKey(String key);
//
    //@ApiOperation("查询系统字典数据表的子模块")
    //@RequestMapping(value = "/dictDataConfig/getSubSystemCodeList", method = RequestMethod.GET)
    //List<DictDataConfigModel> getSubSystemCodeList();
//
    //@ApiOperation("根据子模块ID查询系统字典数据表value")
    //@RequestMapping(value = "/dictDataConfig/selectListBySubSystemId", method = RequestMethod.GET)
    //List<DictDataConfigModel> selectListBySubSystemId(Long subSystemId);
//
    //@ApiOperation("根据ids查询系统字典数据表")
    //@RequestMapping(value = "/dictDataConfig/selectListByIds", method = RequestMethod.POST)
    //List<DictDataConfigModel> selectListByIds(DataDirectionRequest dataDirectionReq);
//
    //@ApiOperation("根据KEY查询系统参数配置")
    //@RequestMapping(value = "/sysParamConfig/selectByKey", method = RequestMethod.GET)
    //SysParamConfig selectByKey(String key);
//
    //@ApiOperation("查询系统字典数据表List")
    //@RequestMapping(value = "/dictDataConfig/selectListIsNotDeleted", method = RequestMethod.GET)
    //List<DictDataConfigModel> selectListIsNotDeleted();
//
    //@ApiOperation("查询系统参数List")
    //@RequestMapping(value = "/sysParamConfig/selectSystemConfigs", method = RequestMethod.GET)
    //List<SysParamConfig> selectSystemConfigs();
//
    //@RequestMapping(value = "/file/selectAttachDataById", method = RequestMethod.POST)
    //@ApiOperation("根据ID查询文件List")
    //List<AttachDataModel> selectAttachDataById(@PathVariable("ids") List<Long> ids);
//
    //@RequestMapping(value = "/file/downFileBytesByIds", method = RequestMethod.POST)
    //@ApiOperation("根据ID下载文件信息")
    //List<AttachDataModel> downFileBytesByIds(@RequestBody List<Long> ids);
//
    //@ApiOperation("*查询回复模板（根据模板类型）")
    //@RequestMapping(value = "/replyTemplate/selectByTemplateType")
    //List<ReplyTemplate> selectByTemplateType(
    //        @ApiParam(value = "模板类型") @RequestParam(value = "templateType") String templateType);
//
    //@RequestMapping(value = "/file/bytes/uploadFile", method = RequestMethod.POST)
    //public AttachData doUploadFileBytes(@RequestBody BytesUploadReq req);
//
//
    //@ApiOperation("根据检查类型查询附件")
    //@RequestMapping(value = "/dictDataConfig/selectAttachDataListByCheckTypeIds", method = RequestMethod.POST)
    //List<AttachData> selectAttachDataListByCheckTypeIds(@RequestBody AttachDataListReq req);
}
