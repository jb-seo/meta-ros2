# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add tests in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_test/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb477741929cba8f8c23ca71df881473"
SRC_URI[sha256sum] = "21dd63dfb447b74879bd79cd12cb644a2e472dd0ab69504bce5ac1dd28fa78f1"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_test-0.5.1-0"


inherit ros
inherit cmake python3native

BBCLASSEXTEND += "native"