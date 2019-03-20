# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export dependencies to downstream packages in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_export_dependencies/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a1211ba0fe5ac0925731e4c129fcea97"
SRC_URI[sha256sum] = "436dc08c6f1f956932b4abbe40d70c2dd72a5fbb46d9237012715f03156e530b"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_export_dependencies-0.5.1-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"