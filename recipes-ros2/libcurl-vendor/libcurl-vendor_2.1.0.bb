# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around libcurl, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = " curl"
SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/crystal/libcurl_vendor/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c9c03575834cd6007b490add29c2e4c"
SRC_URI[sha256sum] = "904b586704ed7f517291b7e7a863772b6cc3c2819fd2a2f1d9fce1f2d1b26708"
S = "${WORKDIR}/resource_retriever-release-release-crystal-libcurl_vendor-2.1.0-0"

inherit ament
