# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add definitions, include directories and libraries of a package to a target in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_target_dependencies/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4720b64f82f40d2a8fbd2c6641107d42"
SRC_URI[sha256sum] = "729efd89471669b397d76579b95b1b3a768a0cbc2f5b8c2a94265f0cca0fce2a"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_target_dependencies-0.5.1-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"