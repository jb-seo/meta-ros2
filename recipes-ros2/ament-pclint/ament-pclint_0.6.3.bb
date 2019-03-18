# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to perform static code analysis on C/C++ code using pclint     and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_pclint/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "329a9f437cd982da74981f3c8e2bcad5"
SRC_URI[sha256sum] = "7fb2d8a28699012336ecafb930b64863560fa745011a9ac59e78efc01f2fd296"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_pclint-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
