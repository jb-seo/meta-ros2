# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some standard message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/std_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0332e4dcd0db83173594c59c4bbc08d9"
SRC_URI[sha256sum] = "16f85394a894a715ad31e0387deced71e5c210fccbc02c06d5f593f58607bfbe"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-std_msgs-0.5.0-1"

inherit catkin
