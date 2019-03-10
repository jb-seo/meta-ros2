# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by py_trees_ros and some extras for the mock demos/tests."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime std-msgs unique-identifier-msgs"
SRC_URI = "https://github.com/stonier/py_trees_msgs-release/archive/release/crystal/py_trees_msgs/0.4.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "150c6fc5fdb872c0a4d58a35a49a0400"
SRC_URI[sha256sum] = "c6410ecfa68a993f3708df63b8c0fc757492c275ceee093c6ec629e13a588102"
S = "${WORKDIR}/py_trees_msgs-release-release-crystal-py_trees_msgs-0.4.3-0"

inherit catkin
