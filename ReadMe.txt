## License

This framework is released under version 2.0 of the [Apache License](http://www.apache.org/licenses/LICENSE-2.0).

联系方式：
Name： Daniel Cao
Mail： 19070443@qq.com

方案一：利用属性文件
1,修改build.properties中的projectName的值为项目名称；
2,用Ant执行build.xml；

方案二：利用命令行参数
1,使用Ant命令行参数-D；
2,在命令行模式下执行 ant -DprojectName=项目名称


3,生成项目位于projects目录内；
4,生成后，web默认访问uri是/{projectName}/v1/add；

5,该分支基于jdk10的分层设计模式(Api/Server)；
