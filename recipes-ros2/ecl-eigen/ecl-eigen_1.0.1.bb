# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This provides an Eigen implementation for ecl's linear algebra."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " eigen"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_eigen/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e13761ec36763b9708b8166b9f3c4a32"
SRC_URI[sha256sum] = "e3f94550689bffd30ec975d5a94c4ac7b521da5f59e5e14b19b1728d0af9c3b2"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_eigen-1.0.1-0"

inherit ament
