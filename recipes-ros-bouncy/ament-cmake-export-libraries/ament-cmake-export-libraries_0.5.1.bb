# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export libraries to downstream packages in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_export_libraries/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1064fb18eca68353be99079c88f315f"
SRC_URI[sha256sum] = "7cf70014d6c3b6aff9d71f72249714a3ce20a1685d2e4f212f9b18b07b4885ff"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_export_libraries-0.5.1-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"