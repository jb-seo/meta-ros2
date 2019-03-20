# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around yaml-cpp, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_yaml_cpp_vendor/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ebe5f3c27fe72b7b8f23c950ee9aa988"
SRC_URI[sha256sum] = "b3345df1774dd5cdb6864b7d49b891f74697f8a82ddb29202f19e0dffeacdcdc"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_yaml_cpp_vendor-4.0.2-0"


inherit ros
inherit ament

