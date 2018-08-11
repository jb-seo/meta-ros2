# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the ROS interfaces in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-generator-c rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/bouncy/rosidl_generator_cpp/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "35a7e7ff725c7dda89046049512d72af"
SRC_URI[sha256sum] = "d223627230837c47cd5f8e79504d97f1755bc70161d4a52625f089042b1ba46a"
S = "${WORKDIR}/rosidl-release-release-bouncy-rosidl_generator_cpp-0.5.1-0"

inherit catkin
