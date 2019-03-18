# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The functionality to deduplicate libraries in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_libraries/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "619f92b71f82f4d1a1a8b81b15073654"
SRC_URI[sha256sum] = "c0256a97b736612cdb5630964f2593f7618999556d161b07a0396d2019eb1baf"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_libraries-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
