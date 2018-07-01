CAS 

1，登录服务器

cas-overlay-template-5.2：maven package编译出cas.war后直接部署就行
编译的时候不要配置阿里云镜像服务器

2，客户端服务器springboot代码：登录的地址需要制定到步骤1 部署的cas.war 地址
sso-client-demo 
sso-client-demo2