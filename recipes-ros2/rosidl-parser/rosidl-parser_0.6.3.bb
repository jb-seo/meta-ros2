# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The parser for ROS interface files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake python3-lark-parser rosidl-adapter"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_parser/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "19cc0ee6a7860dfa50b9a4a5d5586bc9"
SRC_URI[sha256sum] = "28496bca14e887afa1c7c178146ab443934723db1088e8b54dfde79d43cc3d9e"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_parser-0.6.3-0"

inherit catkin
