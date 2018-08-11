# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ API to access the ament resource index."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_index-release/archive/release/bouncy/ament_index_cpp/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5e9ef40ebbb7a5fcd9f202584ba344e2"
SRC_URI[sha256sum] = "d153918f964d8330da0fdfecffc890cbd6bfac6e6102bf4180eac32ba9f9273b"
S = "${WORKDIR}/ament_index-release-release-bouncy-ament_index_cpp-0.5.1-0"

inherit catkin
