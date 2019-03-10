# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some message definitions used in the implementation or actions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/actionlib_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98c92da686509915c25050ccc6bdb5c5"
SRC_URI[sha256sum] = "37d6e848b58289db815f06b0dfd3da6e53e9dc5af9e2cf9acb7f023a425cb814"
S = "${WORKDIR}/common_interfaces-release-release-crystal-actionlib_msgs-0.6.1-0"

inherit catkin
