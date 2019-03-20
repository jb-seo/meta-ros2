# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The functionality to order include directories according to a chain of prefixes in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_include_directories/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5873aa2dbb18efb0e559c59f4f1b09ac"
SRC_URI[sha256sum] = "387aca8b182a1c34d78d5933d285394f2897b55588b8074226b12250ec0f8be2"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_include_directories-0.5.1-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"