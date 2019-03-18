# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake shim over tinydir: https://github.com/cxong/tinydir/"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/tinydir_vendor-release/archive/release/crystal/tinydir_vendor/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f9643959559fdc511f4d6bc3f002ec9"
SRC_URI[sha256sum] = "993a5b8000c90a3284ca05971c79f13f7e71fa2b92e02f865d8d730b9ceaafd3"
S = "${WORKDIR}/tinydir_vendor-release-release-crystal-tinydir_vendor-1.0.1-0"

inherit ament
