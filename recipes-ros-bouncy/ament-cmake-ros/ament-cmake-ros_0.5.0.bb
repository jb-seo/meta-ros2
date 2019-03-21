# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS specific CMake bits in the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake_ros-release/archive/release/bouncy/ament_cmake_ros/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a8f007511f615e3dcee2f04ce5515c5"
SRC_URI[sha256sum] = "cc191a3b4c9b489ec62c46ec7f92b499c5138ef7795e7166cb7bdc5cbb47ff18"
S = "${WORKDIR}/ament_cmake_ros-release-release-bouncy-ament_cmake_ros-0.5.0-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"