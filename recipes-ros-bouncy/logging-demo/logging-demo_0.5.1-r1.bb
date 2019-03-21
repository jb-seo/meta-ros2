# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples for using and configuring loggers."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "class-loader rclcpp rcutils rosidl-cmake rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/logging_demo/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ab4914e4f641519622e8589926aa6ab"
SRC_URI[sha256sum] = "7f6f0816391382a3f278c7cc3acbe85200e69129b0480ed461625b555f1e170c"
S = "${WORKDIR}/demos-release-release-bouncy-logging_demo-0.5.1-1"

inherit ros
inherit ament


