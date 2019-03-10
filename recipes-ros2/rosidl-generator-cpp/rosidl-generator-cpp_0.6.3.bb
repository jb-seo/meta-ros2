# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the ROS interfaces in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-generator-c rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_generator_cpp/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f50aef207c98df0ea28180a9c2bc7bc2"
SRC_URI[sha256sum] = "49fca695e681fc7bb6dc560aecdce2f7a52a177587f9cf8b820cbc473405fbc1"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_generator_cpp-0.6.3-0"

inherit catkin
