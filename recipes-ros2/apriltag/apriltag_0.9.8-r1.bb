# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "AprilTag detector library"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake"
SRC_URI = "https://github.com/christianrauch/${PN}2-release/archive/release/crystal/${PN}/0.9.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de5d408b0a5bef8ab9f0a82777114f1d"
SRC_URI[sha256sum] = "3f021fcda7c06021420a3edbd25dcac2df45bb01d90de64e6cade44e94f8b3e0"
S = "${WORKDIR}/${PN}2-release-release-crystal-${PN}-0.9.8-1"

inherit ament
