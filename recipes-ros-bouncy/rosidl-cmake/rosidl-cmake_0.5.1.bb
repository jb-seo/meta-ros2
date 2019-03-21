# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake functionality to invoke code generation for ROS interface files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/bouncy/rosidl_cmake/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "630879ed440f81560b37af035b0dd461"
SRC_URI[sha256sum] = "5b27143fe0e817b3a593ed1c338095b15c4d824318d8a9aebd0e4289c2c35c69"
S = "${WORKDIR}/rosidl-release-release-bouncy-rosidl_cmake-0.5.1-0"

inherit ros
inherit ament


