# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export link flags to downstream packages in the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_export_link_flags/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ecf1d52d8e2d3dd1d0fcb7a28be182c1"
SRC_URI[sha256sum] = "db2bf6b3f5a113bdb85905d7e90e3030f986d1bf74775e218c10050bda18cce8"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_export_link_flags-0.5.1-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"