#PATH:
main/java/concert/ReadMe.txt

#EXTRA-IMPORT:
spring-aop
spring-aspects
aspectjrt.jar
aspectjweaver.jar

包含内容：
#1
Java配置：
@Import
@ImportResource：引用XML配置

#2
XML配置：
非侵入式配置切面

#3
@Aspect：标注该类是切面
@EnableAspectJAutoProxy：Java配置类中，启用Spring代理使用aspecj功能
带参数的切面

#4
@Qualifier("")：指定接口自动装配时使用哪一个具体实现类