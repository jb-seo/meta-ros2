# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some standard service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/std_srvs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "25c2ed09691526697b5bb4a3b660f756"
SRC_URI[sha256sum] = "4d06ce69faf4d963d9e4bee9890af9869b40eaf25974aee4c45857beaf28e4b0"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-std_srvs-0.5.0-1"

inherit catkin
