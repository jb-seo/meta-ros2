# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export include directories to downstream packages in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_export_include_directories/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff8b9a83e0b68c2b04ff321cc6ae5c67"
SRC_URI[sha256sum] = "b9406d501d7e161fbcbfd6a6c82822f47a84ecec26837a35c7a4746959088392"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_export_include_directories-0.5.1-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"