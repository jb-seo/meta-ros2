# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library for capturing data from the Intel(R) RealSense(TM) SR300 and D400 cameras. This effort was initiated to better support researchers, creative coders, and app developers in domains such as robotics, virtual reality, and the internet of things. Several often-requested features of RealSense(TM); devices are implemented in this project, including multi-camera capture."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=e8978a5103d23266fc6f8ec03dc9eb16"

DEPENDS = " dkms gtk3 libglfw3-dev libssl-dev libusb-1.0-dev linux-headers-generic opengl pkgconfig udev"
SRC_URI = "https://github.com/ros2-gbp/librealsense-release/archive/release/crystal/${PN}/2.16.5-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4c5b4cdf1c029e1163baa004464c0385"
SRC_URI[sha256sum] = "cb95505e6a9a4d16ebb6ca7542eee7bca1afdfca36fd46aa6de30cb011d96b97"
S = "${WORKDIR}/librealsense-release-release-crystal-${PN}-2.16.5-2"

inherit ament
