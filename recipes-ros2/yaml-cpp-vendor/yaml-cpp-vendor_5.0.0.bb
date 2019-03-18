# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around yaml-cpp, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/yaml_cpp_vendor-release/archive/release/crystal/yaml_cpp_vendor/5.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65588716ed72419f3f8026cc8c0fb6de"
SRC_URI[sha256sum] = "40ebab2a3298b5c6f44d69b287d305097cc267912e38722e181f1a903e1d0e63"
S = "${WORKDIR}/yaml_cpp_vendor-release-release-crystal-yaml_cpp_vendor-5.0.0-0"

inherit ament
