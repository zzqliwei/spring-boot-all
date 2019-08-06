1、安装jdk
2、下载源文件elasticsearch-2.4.4.tar.gz
3、解压到 /usr/local
tar -zxvf elasticsearch-2.4.4.tar.gz -C /usr/local
4、编辑配置文件/conf/elasticsearch.yml
bootstrap.memory_lock:true
index.cache.field.max_size:50000
index.cache.field.express:30m
index.cache.field.type:soft

network.host: 192.168.*.25,10.29.*58,127.0.0.1

action.disabed_delete_all_indices:true ##允许删除缩影

注意：不能以root用户运行
使用新用户linux
chown -R linux elasticsearch-2.4.4
chgrp -R linux elasticsearch-2.4.4

启动 ./elasticsearc 默认端口9200

插件sence  /index/type/id?pretty