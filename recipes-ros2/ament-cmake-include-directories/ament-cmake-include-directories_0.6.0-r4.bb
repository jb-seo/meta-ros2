# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The functionality to order include directories according to a chain of prefixes in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_include_directories/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5ebbedbd752e00dd6d99ce53b2b99524"
SRC_URI[sha256sum] = "c217af379e61543bb05ef1fa29a44bb843caf368d9e6dab706d4a7e4633ec14a"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_include_directories-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
