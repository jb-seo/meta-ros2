# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ API to access the ament resource index."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_index-release/archive/release/crystal/ament_index_cpp/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4bd5d59fecc85522d6e60da8625e8784"
SRC_URI[sha256sum] = "ce2cffe1a63b5fa10c1fa8569b30bb1831addeb247a9d69147f5542d4958aeb4"
S = "${WORKDIR}/ament_index-release-release-crystal-ament_index_cpp-0.5.1-0"

inherit catkin
