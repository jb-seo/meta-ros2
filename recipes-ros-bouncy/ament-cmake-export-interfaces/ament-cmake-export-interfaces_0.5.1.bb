# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export interfaces to downstream packages in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_export_interfaces/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8445c70f8d8fec70df3a354bbb2c4fe7"
SRC_URI[sha256sum] = "8e10c92e88b8c454a3e72efd6f2c9affe8289c8ec97018293601f3ac7a7ddad3"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_export_interfaces-0.5.1-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"