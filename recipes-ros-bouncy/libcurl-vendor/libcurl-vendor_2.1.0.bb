# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around libcurl, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "curl"
SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/bouncy/libcurl_vendor/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e1c43763c78c1d471f061243137207a2"
SRC_URI[sha256sum] = "42bade1696caa4699aebdf4daaec5b5083e7d344c5bf2633670a0d8315e765fb"
S = "${WORKDIR}/resource_retriever-release-release-bouncy-libcurl_vendor-2.1.0-0"

inherit ros
inherit ament


