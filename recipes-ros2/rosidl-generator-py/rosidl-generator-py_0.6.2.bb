# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the ROS interfaces in Python."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rmw rmw-implementation rmw-implementation-cmake rosidl-generator-c rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/crystal/rosidl_generator_py/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4be9a1c08966d931d400817200b8ee2d"
SRC_URI[sha256sum] = "823d35a0a74c6b0a77fa614d3faf93ad008278f66d4a8072929ad5cb5190a2f8"
S = "${WORKDIR}/rosidl_python-release-release-crystal-rosidl_generator_py-0.6.2-0"

inherit ament


