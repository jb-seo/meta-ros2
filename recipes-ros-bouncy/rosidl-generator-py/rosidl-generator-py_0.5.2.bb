# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the ROS interfaces in Python."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rmw rmw-implementation rmw-implementation-cmake rosidl-generator-c rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/bouncy/rosidl_generator_py/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2e074a1c86d2f4d56f210a464acfabcb"
SRC_URI[sha256sum] = "8735329c6c55efd8aa6a6ea1c02b7c8b753c81b98034c8fdbc0831975c793a28"
S = "${WORKDIR}/rosidl_python-release-release-bouncy-rosidl_generator_py-0.5.2-0"

inherit catkin
