export PROJECT_DIR=/home/user/Projects/public
export AFL_HOME=$PROJECT_DIR/AFLplusplus
export AFL_DIR=$AFL_HOME
export JQF_HOME=$PROJECT_DIR/jqf
export PATH=$PATH:$AFL_HOME:$JQF_HOME/bin

jqf-afl-fuzz -c ./target/jqf-starter-1.0-SNAPSHOT-jar-with-dependencies.jar -i inputs -o outputs FuzzDriver fuzz
