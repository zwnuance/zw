#!/usr/bin/env bash
#@Author zw
#@Description install hbase

cd /usr/local/
wget http://ftp.cuhk.edu.hk/pub/packages/apache.org/hbase/stable
tar -zxvf hbase*.tar.gz
rm hbase*.tar.gz
hbase*/bin/start-hbase.sh

#Start hbase shell
hbase*/bin/hbase shell