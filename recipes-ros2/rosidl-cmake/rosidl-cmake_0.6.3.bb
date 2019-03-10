# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake functionality to invoke code generation for ROS interface files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-cmake-python rosidl-actions rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_cmake/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f7c5bfd688d7df35a2b6c37cd0989fe"
SRC_URI[sha256sum] = "511f4f0f1635d02c087d46fdb566d7a176bf94d1be85488a8764a9c93f706368"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_cmake-0.6.3-0"

inherit catkin
