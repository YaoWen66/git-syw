package com.sxt;


//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.core.config.GlobalConfig;
//import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.DateType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import org.apache.commons.lang3.StringUtils;
//
//
//import java.util.Scanner;

/**
 * @author shkstart
 * @create 2021-03-12 0:14
 */
public class Syw {
//
//    /**
//     * <p>
//     * 读取控制台内容
//     * </p>
//     */
//    public static String scanner(String tip) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder help = new StringBuilder();
//        help.append("请输入" + tip + "：");
//        System.out.println(help.toString());
//        if (scanner.hasNext()) {
//            String ipt = scanner.next();
//            if (StringUtils.isNotBlank(ipt)) {
//                return ipt;
//            }
//        }
//        throw new MybatisPlusException("请输入正确的" + tip + "！");
//    }
//
//    public static void main(String[] args) {
//
//        // 需要构建一个 代码自动生成器 对象
//        AutoGenerator mpg = new AutoGenerator();
//
//        //配置策略
//
//        //1、全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String propertyPath = System.getProperty("user.dir");
//        gc.setOutputDir(propertyPath + "/src/main/java");//输出路径
//        gc.setAuthor("syw");//作者
//        gc.setOpen(false);//是否打开输出目录
//        gc.setFileOverride(false); // 是否覆盖
//        gc.setServiceName("%sService"); // 去Service的I前缀
//        gc.setIdType(IdType.ID_WORKER);//指定生成的主键的ID类型
//        gc.setDateType(DateType.ONLY_DATE);//日期的类型
////        gc.setSwagger2(true);//是否开启 swagger2 模式
//        mpg.setGlobalConfig(gc);//放入生成器
//
//        //2、设置数据源
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://localhost:3301/0328erp?useSSL=false&useUnicode=true&characterEncoding=utf-8");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("root");
//        dsc.setDbType(DbType.MYSQL);//数据库类型
//        mpg.setDataSource(dsc);//放入生成器
//
//
//        //3、包的配置
//        PackageConfig pc = new PackageConfig();
//        pc.setModuleName(scanner("模块名"));
////        pc.setModuleName("sys");//父包模块名
//        pc.setParent("com.sxt");//父包名
//        pc.setEntity("domain");
//        pc.setMapper("mapper");
//        pc.setService("service");
//        pc.setServiceImpl("service.impl");
//        pc.setController("controller");
//        pc.setXml("mapper.xml");
//        mpg.setPackageInfo(pc);
//
//
//        //4、策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        // 设置要映射的表名
////        strategy.setInclude("employee","news","pay","project","train"," user","userinfo","wage","departments");
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setEntityLombokModel(true); // 自动lombok；
//        strategy.setRestControllerStyle(true);//是否生成resetController
//        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
//        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setTablePrefix(pc.getModuleName() + "_");
//        mpg.setStrategy(strategy);
//        //strategy.setLogicDeleteFieldName("deleted");逻辑删除
//
//
////        // 自动填充配置
////        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
////        TableFill gmtModified = new TableFill("gmt_modified",
////                FieldFill.INSERT_UPDATE);
////        ArrayList<TableFill> tableFills = new ArrayList<>();
////        tableFills.add(gmtCreate);
////        tableFills.add(gmtModified);
////        strategy.setTableFillList(tableFills);
//
//
////        // 乐观锁
////        strategy.setVersionFieldName("version");strategy.setRestControllerStyle(true);
////        strategy.setControllerMappingHyphenStyle(true); //localhost:8080/hello_id_2
////        mpg.setStrategy(strategy);
//
//
//
//        mpg.execute();//执行
//    }


}

